package 最终测验;

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
	return "学生信息:  姓名：" + Name
    + "    学号：" + Num + "   性别：" + Sex + "   " + a;
	}
	public void setName(String name){
		Name = name;
	}
//自定义set函数，设置修改名字的方法
	public void setCourse(Major b){
		a = b;
	}

	

}