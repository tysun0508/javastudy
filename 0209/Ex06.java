class Ex06 
{
	// default�� ������Ű�������� ���� ����
	String name = "ȣ����" ;
	int age = 14 ;

	//������ ���� �ȵ�
	private String name2 = "������" ;
	private int age2 = 3 ;

    private static String name3 = "�����" ;
	static int age3 = 2 ;


	//private �������� �޼ҵ带 �̿��ؼ� �����Ѵ�.  (getter)
	//�������� ���� �����Ҷ��� �޼ҵ带 �̿��Ѵ�.  (setter)

	public String getName2(){
        return name2 ;
	}
	public int getAge2(){
        return age2 ;
	  
	}
	public void setName2(String a){
        name2 = a ;
	}
    public void setAge2(int a){
        age2 = a ;
	}




}
