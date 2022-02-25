import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class cal  implements ActionListener
{	
	JFrame frame;     //JFrame 변수 선언   
	JTextField OperatorField; 
	JTextField resultField;
	JPanel panel;  //Border 
	JPanel panelNorth;  //Border 
	GridLayout grid;
	JButton numButton;
	String[] strGrid={"7","8","9","/","4","5","6","*","1","2","3","-" ,"C","0","+","=" };
	
	private String first="";  		// 숫자 누적
	private String result=""; 		// 결과값  "=" 출력
	ArrayList<Integer> count=new ArrayList<Integer>();  	// 값들 누적으로 받기.
	ArrayList<String> store=new ArrayList<String>();  		// 연산자 누적으로 저장.

	
	public cal(){ //생성자
		frame=new JFrame("계산기");
		
		panel=new JPanel();
		panelNorth=new JPanel();
		resultField=new JTextField("0"); 		// 초기값 0
		OperatorField=new JTextField(""); 		// 연산자만 보이는 텍스트 
	}
		

	public void gui(){
		
		resultField.setHorizontalAlignment(JTextField.RIGHT);   // 우측정렬
		resultField.setEditable(false); 		// 텍스트필드창에 텍스트쓰지못하게 잠금
		
		OperatorField.setHorizontalAlignment(JTextField.RIGHT);  // 우측정렬
		OperatorField.setEditable(false); 	   // 텍스트필드창에 텍스트쓰지못하게 잠금
		
		panelNorth.setLayout(new BorderLayout());    		// 레이아웃 설정.
		panelNorth.add(BorderLayout.NORTH,OperatorField);   // 패널에 텍스트필드를 두개 붙임.
		panelNorth.add(BorderLayout.CENTER,resultField);
		
		panel.setLayout(new GridLayout(4,3,6,6));  		// 그리드 레이아웃 속성설정
	

		for(int i=0; i<strGrid.length; i++){
			numButton = new JButton(strGrid[i]);  			// 버튼 생성 
			numButton.addActionListener(this);	 			// 각 버튼마다 리스너 붙이기
			panel.add(numButton); 							// 패널에 각각의 버튼들 붙이기
		}
		
	
		frame.add(BorderLayout.NORTH,panelNorth); 
		frame.add(BorderLayout.CENTER,panel); 	
		
		frame.setResizable(false);                               //창 크기 변경 못하게 막는다.
		frame.setSize(220,310);                                  //frame 의 크기  
		frame.setVisible(true);                                  //frame을 화면에 나타나도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //X버튼 활성화 
	}//gui()
	
	
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();  	
		String read;				// 텍스트필드에 있는 텍스트 읽기용도
		
		try{	
			//연산기호가 아닌 숫자이면 true 이다.
			if(str!="/" && str!= "*"&& str!= "-"&& str!= "+"&& str!= "C"&& str!= "="){	
				resultField.setText(first);  	// 숫자누적하기위해 필요.
				resultField.getText();  		// 누적 출력
				OperatorField.setText("");		// 연산자 텍스트 초기화
				OperatorField.getText(); 		// 출력
				
				read=resultField.getText();  		// 텍스트에 있는값 불러옴.
				first=read+str;
				resultField.setText(first);		// 누적 저장
				resultField.getText(); 			// 누적 출력
			}// if
			
			
			
			//연산기호가 들어왔을때 true.
			if(str=="/" || str== "*"|| str== "-"|| str== "+"|| str== "="){
				OperatorField.setText(str); 				 // 연산자 기호 저장
				OperatorField.getText();  					// 연산자 기호 출력
				
				count.add(Integer.parseInt(first));  // 연산하려는 값 하나씩 ArrayList에 저장
				first="";							 // 다시 누적하도록 초기화
				
				store.add(str); 			   		 // 연산자 ArrayList에 저장		
			}
			
			
			
			//연산기호 "=" 결과값 눌렀을때.
			if(str=="="){		
				int sum=0;
				sum=count.get(0); 		// 최초 시작값을 받고 시작 
				
				for(int a=0,h=1; a<count.size(); a++,h++){   // ArrayList 크기만큼 반복
					int oper=store.size(); 				// 연산자 누적 횟수 저장
					if(oper>0){							// 연산자 누적 모두 사용할때까지 반복.
						oper--;			
						//if문 또는 switch문으로 가능.
						if(store.get(a)=="+"){			// 연산자 + 일때
							sum=sum+count.get(h);  		
						}else if(store.get(a)=="-"){	// 연산자 - 일때
							sum=sum-count.get(h);	
						}else if(store.get(a)=="*"){	// 연산자 * 일때
							sum=sum*count.get(h);
						}else if(store.get(a)=="/"){	// 연산자 / 일때
							try{				
								sum=sum/count.get(h);
							}catch(Exception exc){		// 나눗셈은 0으로 나눌때 예외발생한다.
								sum=0;  //에러발생시 0으로 출력.
							}
						}			
					}
				}
				result=sum+"";						//총 결과값
				resultField.setText(result);  		// 결과값 저장
				resultField.getText(); 				// 결과출력	
			}
			
			//모든 값 초기화 시키고 다시 연산.
			if(str=="C"){
				first="";
				resultField.setText("0"); 		// 텍스트창 내용 지우고 0출력
				resultField.getText();  			
				OperatorField.setText(""); 	// 연산자 텍스트창 초기화
				OperatorField.getText(); 
				count.clear();  				// 모든 요소들 제거
				store.clear();  				// 모든 요소들 제거
			}
			
		}catch(Exception ex){
			resultField.setText("연산자 연속 입력 오류. C버튼눌러 다시입력 ");  // 텍스트창 내용 전부 지우기
			resultField.getText(); 
		}
	
	}
	

	public static void main(String[] args) 
	{
		cal cal=new cal();
		cal.gui(); //gui 오픈
	}
}