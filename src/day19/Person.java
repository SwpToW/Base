package day19;
/*
 * ��д��ϣ�뷽��
 */
public class Person {
   private String name;
   private int id;
   public Person(){}
   public Person(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
  public int hashCode(){//��д��ϣ��
	  return name.hashCode()+id;
  }
}
