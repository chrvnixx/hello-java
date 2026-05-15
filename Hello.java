class Student
{
    String name;
    int age;
    int grade;

}

public class Hello
{
    public static void main(String a[])
    {
    
    

       Student s1 = new Student();
       s1.name ="frank";
       s1.age = 16;
       s1.grade = 97;

       Student s2 = new Student();
       s2.name ="sinatra";
       s2.age = 12;
       s2.grade = 80;

       Student s3 = new Student();
       s3.name ="kidA";
       s3.age = 17;
       s3.grade = 100;

      Student students[] = new Student[3];
        students[0] = s1; 
        students[1] = s2; 
        students[2] = s3; 

        System.out.println(students[0].name + " : " + students[2].age);

        // for(Student n : students)
        // {
        //     System.out.println(n.name + " : " + n.age);
        // }
       
    }

}