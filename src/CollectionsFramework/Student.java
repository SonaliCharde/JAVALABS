package CollectionsFramework;

import java.util.Comparator;

class SortbyIDAsc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId() );
    }
}
class SortbyDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
class SortnameAsc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class SortnameDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getId().compareTo(o1.getId());
    }
}

public class Student implements Comparable<Student> {
    public Student (Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    String name;

    public String toString(){
        return "Student{"+
                "id="+", name='" +name+'\''+'}';
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return 0;
//    }
}
