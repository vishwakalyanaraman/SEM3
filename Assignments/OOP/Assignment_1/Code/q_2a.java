 //example of this keyword  
class q_2a{  
        int id;  
        String name;  
        
/* Here the parameterized constructor is also using
	the same variable name's, so this is used.*/  
        q_2a(int id,String name){  
        this.id = id;  
        this.name = name;  
        }
  
        void display(){
			System.out.println(id+" "+name);
}  
        public static void main(String args[]){
  
        q_2a s1 = new q_2a(111,"Karan");  
        q_2a s2 = new q_2a(222,"Aryan");  
        s1.display();  
        s2.display();  
    }  
}  
