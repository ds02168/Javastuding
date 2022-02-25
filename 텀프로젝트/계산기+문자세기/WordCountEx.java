import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class WordCount extends JFrame {
	JTextField rout; //��θ� �Է��� �ؽ�Ʈ �ʵ�
	JButton load; //�ҷ����� �׼��� ���� ��ư
	JTable ShowResult; //�ܾ���� �����ϴ� ���̺�
	String[] header = { "�ܾ�", "���� Ƚ��" };
	String[][] row = { { "", "" } }; //���̺��� �ʱⰪ
	DefaultTableModel dtm; //���̺��� ���� (���̺���� ��������ν� ���� ����)
	JScrollPane scroll; //���̺��� ��ũ��

	public WordCount() {
		setTitle("WordCount");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �⺻ ����

		Container c = getContentPane();
		c.setLayout(null); //��ġ�����ڸ� ���۴ϴ�.

		rout = new JTextField();
		rout.setSize(665, 40);
		rout.setLocation(5, 10); //�ؽ�Ʈ�ʵ�

		dtm = new DefaultTableModel(row, header); //���̺� ������
		ShowResult = new JTable(dtm); //���̺� �޾��ְ�
		scroll = new JScrollPane(ShowResult); //���̺��� ��ũ���ҿ� �޾��ݴϴ�.
		scroll.setSize(775, 490);
		scroll.setLocation(5, 60);

		load = new JButton("�ҷ�����");
		load.setSize(100, 40);
		load.setLocation(680, 10); //��ư

		c.add(load);
		c.add(rout);
		c.add(scroll); //GUI�� �߰�

		MyActionListener ma = new MyActionListener(rout, ShowResult);
		load.addActionListener(ma); //��ư�� �׼Ǹ����ʸ� �޾��ݴϴ�.

		setSize(800, 600);
		setVisible(true);
	}
}

class MyActionListener implements ActionListener { //��ư�� ������ �޴� ������ Ŭ����
	JTextField rout2;
	JTable result; //���̺�� �ؽ�Ʈ�ʵ�� GUI��ü�� ����
	Vector<voca> v; //������ �ȵ� ����(���Ͽ��� �ҷ����� �ܾ� ������ ����)
	Vector<voca> data; //�콬���� ������ ���� �����͵�
	String[] header = { "�ܾ�", "���� Ƚ��" };
	String[][] row; //���ĵ� �����͸� ���ڿ�ȭ �Ͽ� �����ϴ� ������ �迭
	DefaultTableModel dtm; //���̺� �ƾ��� ������ ����

	MyActionListener(JTextField a, JTable b) { //������
		rout2 = a;
		result = b;//GUI��ü�� �޾ƿɴϴ�.
	}

	public void actionPerformed(ActionEvent e) { //�׼� �޼ҵ�(�������̵�)
		String infile = rout2.getText(); //�ؽ�Ʈ �ʵ�κ��� ��θ� �޾ƿɴϴ�.
		System.out.println(infile); //�ֿܼ� Ȯ��

		loadData(infile);// ���� �ҷ�����
		row = new String[data.size()][2]; //�ܾ��� ������ŭ �������迭 ũ�� �Ҵ�

		for (int i = 0; i < data.size(); i++) { //�ܾ�,Ƚ�� ���ڿ�ȭ�Ͽ� �������迭�� ����
			row[i][0] = data.get(i).getAlpha();
			row[i][1] = Integer.toString(data.get(i).getCount());
		}
		dtm = new DefaultTableModel(row, header); //�������迭�� ��üȭ�� ���̺� ��
		result.setModel(dtm); //���ι��� ������ ����
	}

	void loadData(String infile) { //���Ϸκ��� �����͸� �ҷ��� ���Ϳ� �����ϴ� �޼ҵ�
		token tk = new token(infile); //���Ϸκ��� �ܾ �ҷ����� ��ü
		v = tk.getVector(); //�ܾ����(���� ����x)���͸� �����ɴϴ�.
		HashData hd = new HashData(v); //�ؽ������� �ܾ���� ������������ �����ϴ� ��ü
		data = hd.getData(); //���ĵ� ���͸� �����ɴϴ�.

	}
}

class voca { //�ܾ�� �ܾ���� �����ϴ� Ŭ����, ��üȭ �Ǿ� ���Ϳ� ����
	private String Alpha; //�ܾ�
	private int Count; //�ܾ� ����

	public voca(String Alpha) { //������
		this.Alpha = new String(Alpha);
		Count = 1; //ó�� ���� �ܾ�� �翬�� ���� 1
	}

	public void add() { //�ܾ� �ߺ��� �޼ҵ�
		Count++; //������ +1���ݴϴ�.
	}

	public void setCount(int i) { //�ܾ� ������ �����ϴ� �޼ҵ�
		Count = i;
	}

	public String getAlpha() { //�ܾ �����ϴ� �޼ҵ�
		return Alpha;
	}

	public int getCount() { //�ܾ� ������ �����ϴ� �޼ҵ�
		return Count;
	}

}

class token { //���Ϸκ��� �ܾ �ҷ����� Ŭ����

	Vector<voca> v; //�ܾ�� �ܾ���� ���� ��ü�� ���� ����

	token(String infile) { //������(���ϰ�θ� ����)
		boolean flag; //�ܾ ���Ϳ� �������� ������ �����ϴ� flag(true == �������, false == ����)
		Scanner scan = new Scanner(System.in);
		v = new Vector<voca>();
		String[] ban = { "am", "are", "is", "were", "was", "be", "aren", "isn", "weren", "wasn", "a", "an", "the",
				"about", "against", "along", "around", "ve", "de", "nt", "can", "don", "will", "would", "wouldn","did","may",
				"should", "could", "shouldn", "couldn", "as", "so", "if", "ll", "st", "em", "tm", "at", "beside","didn",
				"beneath", "between", "but", "by", "down", "during", "for", "from", "in", "into", "of", "off", "on",
				"re", "ye", "out", "over", "per", "round", "since", "through", "till", "to", "toward", "until", "up",
				"upon", "with", "within", "without" };
		// �񵿻�+��ġ��+����+������+��Ÿ������ �����縦 �ɷ��ִ� ����
		// ��Ű��� ��ġ������: https://ko.wiktionary.org/wiki/%EB%B6%80%EB%A1%9D:%EC%98%81%EC%96%B4_%EC%A0%84%EC%B9%98%EC%82%AC
		try {
			String absol = new File(".").getAbsolutePath() + "\\" +infile; //�����η� ����� ������ݴϴ�. (���� ������Ʈ ����)
			System.out.println(absol);
			
			BufferedReader in = new BufferedReader(new FileReader(absol)); //�ش��η� ���� ��Ʈ���� ���ϴ�.

			String s;

			while ((s = in.readLine()) != null) {
				StringTokenizer stok = new StringTokenizer(s, " % ., -_'\"?!()[]:\t\n;+*@#$^&="); //�����ڷ� ���ڿ��� �ܾ��� �����ϴ�.
				while (stok.hasMoreTokens()) {
					String str = stok.nextToken().toLowerCase(); //�ҹ��ڷ� �� �ܾ ����
					flag = false; //false�� �ʱ�ȭ(ó�� ���´ٰ� ����)
					for (int i = 0; i < v.size(); i++) {
						if (v.get(i).getAlpha().equals(str)) { //���Ϳ� �̹� ������
							v.get(i).add(); //�ܾ�Ƚ���� ����
							flag = true; //true�� ���������ν� ���Ϳ� �߰�x
							break;
						}
					}

					for (int i = 0; i < ban.length; i++) {
						if ((str.length() == 1) || (ban[i].equals(str))) { //�ѱ��� �ų� ���� ���ܵǾ��� �ܾ���̸�
							flag = true; //true�� ���������ν� ���Ϳ� �߰�x
							break;
						}
					}

					if (flag == false) { //���Ϳ� ����, �ѱ��ڵ� �ƴϰ�, ���ܵǾ��� ���ڵ� �ƴϸ�
						v.add(new voca(str)); //���Ϳ� ����
					}
				}

			}
		} catch (IOException e) { //���� ó��
			System.out.println("������ ������ �����ϴ�.");

		}
		scan.close();
	}

	Vector<voca> getVector() { //���͸� �����ϴ� �޼ҵ�
		return v; //���ĵ��� ���� ���� ����
	}

}

class HashData { //�콬������ ������ ���͸� �����ϴ� Ŭ����

	Vector<voca> data; //�ܾ���� ���ĵ� ����
	voca InsertData;

	HashData(Vector<voca> v) {
		Map<String, Integer> h = new HashMap<String, Integer>(); //�콬��
		data = new Vector<voca>();
		String temp;
		int count;
		for (int i = 0; i < v.size(); i++) {
			h.put(v.get(i).getAlpha(), v.get(i).getCount()); //�ؽ��ʿ� ���ĵ��� ���� ������ �ܾ�, ������ �Է�
		}

		Iterator it = sortByValue(h).iterator(); //�ܾ���� ������������ ����

		while (it.hasNext()) {
			temp = (String) it.next();
			count = h.get(temp); //�ܾ���� ������������
			InsertData = new voca(temp);
			InsertData.setCount(count); //voca��ü�� �����
			data.add(InsertData); //���Ϳ� ����
		}

	}

	public List sortByValue(final Map map) { //�ؽ����� �ܾ���� ������������ �����ϴ� �޼ҵ�
		List<String> list = new ArrayList();
		list.addAll(map.keySet()); //����Ʈ ���
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);

				return ((Comparable) v2).compareTo(v1);
			}
		});

		return list;
	}

	Vector<voca> getData() { //���ĵ� ���͸� �����ϴ� �޼ҵ�
		return data; //���ĵ� ���� ����
	}

}

public class WordCountEx {
	public static void main(String[] args) {
		new WordCount(); //WordCount ����

	}
}
