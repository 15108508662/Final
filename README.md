# Final
大181张宏建2018310997
一、实验目的
分析学生选课系统的数据结构并且将文件中的数据以字符串形式读出；使用GUI窗体及其组件设计窗体界面让数据可视性更强同时完成读取和写入的功能；完成学生选课过程业务逻辑编程，实现选课退课开课的功能；基于文件保存并读取数据，新建文本文件，将文本文件中的数据在GUI中显示；处理异常，防止文件中出现空白字符。
二、实验要求
1、内容：设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。 2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。 3、针对操作过程中可能会出现的各种异常，做异常处理 4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。 5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。

代码：
  JLabel label1;JLabel label2;JLabel label3;JLabel label5;JLabel label6;
	JLabel label7;JLabel label8;JLabel label9;JLabel label10,label11;JLabel label12;JLabel label13;

	JButton button1,button2;
	JButton button3,button4;
	TextArea ta1,ta2;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	CheckboxGroup cbg;
	JComboBox b4;JComboBox b5;
	JCheckBox c1,c2,c3;
  
  	public void actionPerformed(ActionEvent e){
	    	Major p = null;
	    	Major q = null;
	    	Major r = null;
	    	Student student = null;
	    	Major major = null;
		    String str="";

		    File file=new File("C:\\Users\\SHINELON\\Desktop\\课程信息.txt");

		    try {

		        FileInputStream in=new FileInputStream(file);

		        // size  为字串的长度 ，这里一次性读完

		        int size=in.available();

		        byte[] buffer=new byte[size];

		        in.read(buffer);

		        in.close();

		        str=new String(buffer,"GB2312");

		    } catch (IOException e1) {

		        // TODO Auto-generated catch block


		        e1.printStackTrace();

		    }
			String b[] = str.split(",");
	    	p  = new Major(b[0],b[1],b[2],b[3],b[4]);
	    	q  = new Major(b[5],b[6],b[7],b[8],b[9]);
	    	r  = new Major(b[10],b[11],b[12],b[13],b[14]);

	    	
	    	if(e.getSource()==button1)
				ta1.append("姓名："+t1.getText()+"\n"+
				"学号："+t2.getText()+"\n"+"性别："
				+cbg.getSelectedCheckbox().getLabel());

			
	    	
	    			if(c1.isSelected() && e.getSource()==button1)
					ta1.append( "课程：" + c1.getLabel()+" "+p.toString()+"\n");

					student = new Student(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),p);
					StringBuffer s1=new StringBuffer();
					s1.append(student);
					s1.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\Users\\SHINELON\\Desktop\\test.txt");
						fw.write(s1.toString() + "\n");
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					if(c2.isSelected() && e.getSource()==button1)
					ta1.append( "课程：" + c2.getLabel()+" "+q.toString()+"\n");
					student = new Student(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),q);
					StringBuffer s_1=new StringBuffer();
					s_1.append(student);
					s_1.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\Users\\SHINELON\\Desktop\\test.txt");
						fw.write(s_1.toString() + "\n");
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					
					if(c3.isSelected() && e.getSource()==button1)
					ta1.append( "课程：" + c3.getLabel()+" "+r.toString()+"\n");

					student = new Student(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),r);


					
					StringBuffer s_2=new StringBuffer();
					s_2.append(student);
					s_2.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\Users\\SHINELON\\Desktop\\test.txt");
						fw.write(s_2.toString() + "\n");
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					
					if(e.getSource()==button1)
					ta1.append("\n");
			if(e.getSource()==button4){
				System.exit(0);
			}

			if(e.getSource()==button3)
				ta2.append("教师姓名："+t3.getText()+"\n"+
				"课程名称："+t4.getText()+"\n"+"上课地点："+t6.getText()
				+"\n"+"课程编号："+t5.getText()+"\n"+"课时："+b4.getSelectedItem()
				+"\n"+"学分："+b5.getSelectedItem()+"\n");
			if(e.getSource()==button3)
				ta2.append("\n");
				majorattribute = new Major(t4.getText(),t5.getText(),
						t6.getText(),t7.getText(),t8.getText());


		}
    
    
    
    感想：
    有所收获，最后还是有所收获。
