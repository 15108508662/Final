package ���ղ���;

public class Student extends Father{

	Major a ;
	Major major;
	public Student(String name,String num,String sex,Major a) {
		Name = name;
		Num = num;
		Sex = sex;
		major = a;

		}

	public String toString() {
	return "ѧ����Ϣ:  ������" + Name
    + "    ѧ�ţ�" + Num + "   �Ա�" + Sex + "   " + a;
	}
	public void setName(String name){
		Name = name;
	}
//�Զ���set�����������޸����ֵķ���
	public void setCourse(Major b){
		a = b;
	}

	

}