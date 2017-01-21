import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by lsr on 2016/11/24.
 */
public class Main {
    public static void main(String[] args){
    	long r=System.currentTimeMillis();
        try {
            Executor executor1 = new Executor();

            File file = new File("./src/test.txt");

            Scanner scanner = new Scanner(new FileInputStream(file));
            int i = 0;
            while (scanner.hasNextLine()) {
                i++;
               executor1.execute(scanner.nextLine());       
            }
            System.out.println(System.currentTimeMillis()-r+"ms");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    	
//    	Executor executor1=new Executor();
//        String create_sql = "CREATE TABLE course (sid INT, homework INT, project INT, exam INT, grade STR20)";
//        String insert_sql ="INSERT INTO course (sid, homework, project, exam, grade) VALUES (1, 99, 100, 100, \"A\")";
//        String insert_sql2="INSERT INTO course (sid, grade, exam, project, homework) VALUES (3, \"E\", 101, 100, 100)";
//        String insert_sql3="INSERT INTO course (sid, homework, project, exam, grade) VALUES (1, 99, 100, 100, \"A\")";
////        String insert_sql5="INSERT INTO course (sid, homework, project, exam, grade) select * from course";
////        String create_sql2="CREATE TABLE course2 (sid INT, exam INT, grade STR20)";
////        String insert_sql4="INSERT INTO course2 (sid, exam, grade) VALUES (1, 100, \"A\")";
////        String select_sql="select course.sid, course.homework FROM course, course2 where course.grade = \"E\" and course2.sid = 1 and course.project < 103 or course.grade = \"A\" ";
//          String select_sql2="select DISTINCT * from course order by exam";
////        String delete_sql1="DELETE FROM course where (homework + project) = 199";
////        String delete_sql2="DELETE FROM course";
//        executor1.execute(create_sql);
//        executor1.execute(insert_sql);
//        executor1.execute(insert_sql2);
//        executor1.execute(insert_sql3);
////        executor1.execute(insert_sql5);
////        executor1.execute(create_sql2);
////        executor1.execute(insert_sql4);
////        executor1.execute(select_sql);
//        executor1.execute(select_sql2);
////        executor1.execute(delete_sql1);      
////        executor1.execute(delete_sql2);
    }
}
