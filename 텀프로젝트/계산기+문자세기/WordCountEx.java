import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class WordCount extends JFrame {
	JTextField rout; //경로를 입력할 텍스트 필드
	JButton load; //불러들일 액션을 취할 버튼
	JTable ShowResult; //단어수를 나열하는 테이블
	String[] header = { "단어", "나온 횟수" };
	String[][] row = { { "", "" } }; //테이블의 초기값
	DefaultTableModel dtm; //테이블의 내용 (테이블모델을 사용함으로써 갱신 가능)
	JScrollPane scroll; //테이블의 스크롤

	public WordCount() {
		setTitle("WordCount");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 기본 셋팅

		Container c = getContentPane();
		c.setLayout(null); //배치관리자를 없앱니다.

		rout = new JTextField();
		rout.setSize(665, 40);
		rout.setLocation(5, 10); //텍스트필드

		dtm = new DefaultTableModel(row, header); //테이블 내용을
		ShowResult = new JTable(dtm); //테이블에 달아주고
		scroll = new JScrollPane(ShowResult); //테이블을 스크롤팬에 달아줍니다.
		scroll.setSize(775, 490);
		scroll.setLocation(5, 60);

		load = new JButton("불러오기");
		load.setSize(100, 40);
		load.setLocation(680, 10); //버튼

		c.add(load);
		c.add(rout);
		c.add(scroll); //GUI에 추가

		MyActionListener ma = new MyActionListener(rout, ShowResult);
		load.addActionListener(ma); //버튼에 액션리스너를 달아줍니다.

		setSize(800, 600);
		setVisible(true);
	}
}

class MyActionListener implements ActionListener { //버튼의 동작을 받는 리스너 클래스
	JTextField rout2;
	JTable result; //테이블과 텍스트필드는 GUI객체와 동일
	Vector<voca> v; //정렬이 안된 벡터(파일에서 불러들인 단어 데이터 저장)
	Vector<voca> data; //헤쉬맵을 정렬을 통한 데이터들
	String[] header = { "단어", "나온 횟수" };
	String[][] row; //정렬된 데이터를 문자열화 하여 저장하는 이차원 배열
	DefaultTableModel dtm; //테이블에 싣어질 데이터 더미

	MyActionListener(JTextField a, JTable b) { //생성자
		rout2 = a;
		result = b;//GUI객체를 받아옵니다.
	}

	public void actionPerformed(ActionEvent e) { //액션 메소드(오버라이딩)
		String infile = rout2.getText(); //텍스트 필드로부터 경로를 받아옵니다.
		System.out.println(infile); //콘솔에 확인

		loadData(infile);// 파일 불러오기
		row = new String[data.size()][2]; //단어의 갯수만큼 이차원배열 크기 할당

		for (int i = 0; i < data.size(); i++) { //단어,횟수 문자열화하여 이차원배열에 저장
			row[i][0] = data.get(i).getAlpha();
			row[i][1] = Integer.toString(data.get(i).getCount());
		}
		dtm = new DefaultTableModel(row, header); //이차원배열로 객체화한 테이블 모델
		result.setModel(dtm); //새로받은 데이터 갱신
	}

	void loadData(String infile) { //파일로부터 데이터를 불러와 벡터에 저장하는 메소드
		token tk = new token(infile); //파일로부터 단어를 불러오는 객체
		v = tk.getVector(); //단어모음(아직 정렬x)베터를 가져옵니다.
		HashData hd = new HashData(v); //해쉬맵으로 단어수를 내림차순으로 정렬하는 객체
		data = hd.getData(); //정렬된 벡터를 가져옵니다.

	}
}

class voca { //단어와 단어갯수를 저장하는 클래스, 객체화 되어 벡터에 저장
	private String Alpha; //단어
	private int Count; //단어 갯수

	public voca(String Alpha) { //생성자
		this.Alpha = new String(Alpha);
		Count = 1; //처음 나온 단어는 당연히 갯수 1
	}

	public void add() { //단어 중복시 메소드
		Count++; //갯수를 +1해줍니다.
	}

	public void setCount(int i) { //단어 갯수를 설정하는 메소드
		Count = i;
	}

	public String getAlpha() { //단어를 리턴하는 메소드
		return Alpha;
	}

	public int getCount() { //단어 갯수를 리턴하는 메소드
		return Count;
	}

}

class token { //파일로부터 단어를 불러오는 클레스

	Vector<voca> v; //단어와 단어갯수를 가진 객체를 담을 벡터

	token(String infile) { //생성자(파일경로를 받음)
		boolean flag; //단어를 벡터에 저장할지 안할지 결정하는 flag(true == 저장안함, false == 저장)
		Scanner scan = new Scanner(System.in);
		v = new Vector<voca>();
		String[] ban = { "am", "are", "is", "were", "was", "be", "aren", "isn", "weren", "wasn", "a", "an", "the",
				"about", "against", "along", "around", "ve", "de", "nt", "can", "don", "will", "would", "wouldn","did","may",
				"should", "could", "shouldn", "couldn", "as", "so", "if", "ll", "st", "em", "tm", "at", "beside","didn",
				"beneath", "between", "but", "by", "down", "during", "for", "from", "in", "into", "of", "off", "on",
				"re", "ye", "out", "over", "per", "round", "since", "through", "till", "to", "toward", "until", "up",
				"upon", "with", "within", "without" };
		// 비동사+전치사+관사+조동사+기타부정형 조동사를 걸러주는 필터
		// 위키백과 전치사참조: https://ko.wiktionary.org/wiki/%EB%B6%80%EB%A1%9D:%EC%98%81%EC%96%B4_%EC%A0%84%EC%B9%98%EC%82%AC
		try {
			String absol = new File(".").getAbsolutePath() + "\\" +infile; //절대경로로 상대경로 만들어줍니다. (현재 프로젝트 기준)
			System.out.println(absol);
			
			BufferedReader in = new BufferedReader(new FileReader(absol)); //해당경로로 문자 스트림을 엽니다.

			String s;

			while ((s = in.readLine()) != null) {
				StringTokenizer stok = new StringTokenizer(s, " % ., -_'\"?!()[]:\t\n;+*@#$^&="); //구분자로 문자열을 단어들로 나눕니다.
				while (stok.hasMoreTokens()) {
					String str = stok.nextToken().toLowerCase(); //소문자로 한 단어씩 저장
					flag = false; //false로 초기화(처음 나온다고 가정)
					for (int i = 0; i < v.size(); i++) {
						if (v.get(i).getAlpha().equals(str)) { //벡터에 이미 있으면
							v.get(i).add(); //단어횟수만 증가
							flag = true; //true로 설정함으로써 벡터에 추가x
							break;
						}
					}

					for (int i = 0; i < ban.length; i++) {
						if ((str.length() == 1) || (ban[i].equals(str))) { //한글자 거나 위의 제외되야할 단어들이면
							flag = true; //true로 설정함으로써 벡터에 추가x
							break;
						}
					}

					if (flag == false) { //벡터에 없고, 한글자도 아니고, 제외되야할 문자도 아니면
						v.add(new voca(str)); //벡터에 저장
					}
				}

			}
		} catch (IOException e) { //예외 처리
			System.out.println("파일을 읽을수 없습니다.");

		}
		scan.close();
	}

	Vector<voca> getVector() { //벡터를 리터하는 메소드
		return v; //정렬되지 않은 벡터 리턴
	}

}

class HashData { //헤쉬맵으로 정렬한 벡터를 리턴하는 클래스

	Vector<voca> data; //단어갯수로 정렬된 벡터
	voca InsertData;

	HashData(Vector<voca> v) {
		Map<String, Integer> h = new HashMap<String, Integer>(); //헤쉬맵
		data = new Vector<voca>();
		String temp;
		int count;
		for (int i = 0; i < v.size(); i++) {
			h.put(v.get(i).getAlpha(), v.get(i).getCount()); //해쉬맵에 정렬되지 않은 벡터의 단어, 갯수를 입력
		}

		Iterator it = sortByValue(h).iterator(); //단어갯수의 내림차순으로 정렬

		while (it.hasNext()) {
			temp = (String) it.next();
			count = h.get(temp); //단어갯수의 내림차순으로
			InsertData = new voca(temp);
			InsertData.setCount(count); //voca객체를 만들고
			data.add(InsertData); //벡터에 저장
		}

	}

	public List sortByValue(final Map map) { //해쉬맵을 단어갯수의 내림차순으로 정렬하는 메소드
		List<String> list = new ArrayList();
		list.addAll(map.keySet()); //리스트 사용
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);

				return ((Comparable) v2).compareTo(v1);
			}
		});

		return list;
	}

	Vector<voca> getData() { //정렬된 벡터를 리턴하는 메소드
		return data; //정렬된 벡터 리턴
	}

}

public class WordCountEx {
	public static void main(String[] args) {
		new WordCount(); //WordCount 생성

	}
}
