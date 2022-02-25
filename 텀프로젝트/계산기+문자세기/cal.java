import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class cal  implements ActionListener
{	
	JFrame frame;     //JFrame ���� ����   
	JTextField OperatorField; 
	JTextField resultField;
	JPanel panel;  //Border 
	JPanel panelNorth;  //Border 
	GridLayout grid;
	JButton numButton;
	String[] strGrid={"7","8","9","/","4","5","6","*","1","2","3","-" ,"C","0","+","=" };
	
	private String first="";  		// ���� ����
	private String result=""; 		// �����  "=" ���
	ArrayList<Integer> count=new ArrayList<Integer>();  	// ���� �������� �ޱ�.
	ArrayList<String> store=new ArrayList<String>();  		// ������ �������� ����.

	
	public cal(){ //������
		frame=new JFrame("����");
		
		panel=new JPanel();
		panelNorth=new JPanel();
		resultField=new JTextField("0"); 		// �ʱⰪ 0
		OperatorField=new JTextField(""); 		// �����ڸ� ���̴� �ؽ�Ʈ 
	}
		

	public void gui(){
		
		resultField.setHorizontalAlignment(JTextField.RIGHT);   // ��������
		resultField.setEditable(false); 		// �ؽ�Ʈ�ʵ�â�� �ؽ�Ʈ�������ϰ� ���
		
		OperatorField.setHorizontalAlignment(JTextField.RIGHT);  // ��������
		OperatorField.setEditable(false); 	   // �ؽ�Ʈ�ʵ�â�� �ؽ�Ʈ�������ϰ� ���
		
		panelNorth.setLayout(new BorderLayout());    		// ���̾ƿ� ����.
		panelNorth.add(BorderLayout.NORTH,OperatorField);   // �гο� �ؽ�Ʈ�ʵ带 �ΰ� ����.
		panelNorth.add(BorderLayout.CENTER,resultField);
		
		panel.setLayout(new GridLayout(4,3,6,6));  		// �׸��� ���̾ƿ� �Ӽ�����
	

		for(int i=0; i<strGrid.length; i++){
			numButton = new JButton(strGrid[i]);  			// ��ư ���� 
			numButton.addActionListener(this);	 			// �� ��ư���� ������ ���̱�
			panel.add(numButton); 							// �гο� ������ ��ư�� ���̱�
		}
		
	
		frame.add(BorderLayout.NORTH,panelNorth); 
		frame.add(BorderLayout.CENTER,panel); 	
		
		frame.setResizable(false);                               //â ũ�� ���� ���ϰ� ���´�.
		frame.setSize(220,310);                                  //frame �� ũ��  
		frame.setVisible(true);                                  //frame�� ȭ�鿡 ��Ÿ������ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //X��ư Ȱ��ȭ 
	}//gui()
	
	
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();  	
		String read;				// �ؽ�Ʈ�ʵ忡 �ִ� �ؽ�Ʈ �б�뵵
		
		try{	
			//�����ȣ�� �ƴ� �����̸� true �̴�.
			if(str!="/" && str!= "*"&& str!= "-"&& str!= "+"&& str!= "C"&& str!= "="){	
				resultField.setText(first);  	// ���ڴ����ϱ����� �ʿ�.
				resultField.getText();  		// ���� ���
				OperatorField.setText("");		// ������ �ؽ�Ʈ �ʱ�ȭ
				OperatorField.getText(); 		// ���
				
				read=resultField.getText();  		// �ؽ�Ʈ�� �ִ°� �ҷ���.
				first=read+str;
				resultField.setText(first);		// ���� ����
				resultField.getText(); 			// ���� ���
			}// if
			
			
			
			//�����ȣ�� �������� true.
			if(str=="/" || str== "*"|| str== "-"|| str== "+"|| str== "="){
				OperatorField.setText(str); 				 // ������ ��ȣ ����
				OperatorField.getText();  					// ������ ��ȣ ���
				
				count.add(Integer.parseInt(first));  // �����Ϸ��� �� �ϳ��� ArrayList�� ����
				first="";							 // �ٽ� �����ϵ��� �ʱ�ȭ
				
				store.add(str); 			   		 // ������ ArrayList�� ����		
			}
			
			
			
			//�����ȣ "=" ����� ��������.
			if(str=="="){		
				int sum=0;
				sum=count.get(0); 		// ���� ���۰��� �ް� ���� 
				
				for(int a=0,h=1; a<count.size(); a++,h++){   // ArrayList ũ�⸸ŭ �ݺ�
					int oper=store.size(); 				// ������ ���� Ƚ�� ����
					if(oper>0){							// ������ ���� ��� ����Ҷ����� �ݺ�.
						oper--;			
						//if�� �Ǵ� switch������ ����.
						if(store.get(a)=="+"){			// ������ + �϶�
							sum=sum+count.get(h);  		
						}else if(store.get(a)=="-"){	// ������ - �϶�
							sum=sum-count.get(h);	
						}else if(store.get(a)=="*"){	// ������ * �϶�
							sum=sum*count.get(h);
						}else if(store.get(a)=="/"){	// ������ / �϶�
							try{				
								sum=sum/count.get(h);
							}catch(Exception exc){		// �������� 0���� ������ ���ܹ߻��Ѵ�.
								sum=0;  //�����߻��� 0���� ���.
							}
						}			
					}
				}
				result=sum+"";						//�� �����
				resultField.setText(result);  		// ����� ����
				resultField.getText(); 				// ������	
			}
			
			//��� �� �ʱ�ȭ ��Ű�� �ٽ� ����.
			if(str=="C"){
				first="";
				resultField.setText("0"); 		// �ؽ�Ʈâ ���� ����� 0���
				resultField.getText();  			
				OperatorField.setText(""); 	// ������ �ؽ�Ʈâ �ʱ�ȭ
				OperatorField.getText(); 
				count.clear();  				// ��� ��ҵ� ����
				store.clear();  				// ��� ��ҵ� ����
			}
			
		}catch(Exception ex){
			resultField.setText("������ ���� �Է� ����. C��ư���� �ٽ��Է� ");  // �ؽ�Ʈâ ���� ���� �����
			resultField.getText(); 
		}
	
	}
	

	public static void main(String[] args) 
	{
		cal cal=new cal();
		cal.gui(); //gui ����
	}
}