package week16;


/**
 * Write a description of class CensusProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CensusProcessor
{


public static Student[] parseCSV(String[] csvData)
{

Student list[]=new Student[csvData.length-1];

int k=0;

for(int i=1;i<csvData.length;i++)
{

String row=csvData[i];

String d[]=row.split(",");

String name=d[0].trim();

int age=Integer.parseInt(d[1].trim());

String school=d[2].trim();

int grade=Integer.parseInt(d[3].trim());

String citizenship=d[4].trim();

String phone=d[5].trim();


list[k]=new Student(name,age,school,grade,citizenship,phone);

k++;

}

return list;

}




public static boolean isValidCitizenship(String c)
{

if(c.length()!=10)
return false;

if(c.charAt(2)!='-')
return false;


for(int i=0;i<2;i++)
{

if(!Character.isDigit(c.charAt(i)))

return false;

}


for(int i=3;i<10;i++)
{

if(!Character.isDigit(c.charAt(i)))

return false;

}

return true;

}



public static Student[] findBySchool(Student students[],String school)
{

Student temp[]=new Student[students.length];

int count=0;

for(int i=0;i<students.length;i++)
{

if(students[i].getSchool().equalsIgnoreCase(school))
{

temp[count]=students[i];

count++;

}

}

return temp;

}



public static int countByGrade(Student students[],int g)
{

int c=0;

for(int i=0;i<students.length;i++)
{

if(students[i].getGrade()==g)

c++;

}

return c;

}



public static double averageAge(Student students[])
{

int sum=0;

for(int i=0;i<students.length;i++)
{

sum=sum+students[i].getAge();

}

double avg=(double)sum/students.length;

return avg;

}



public static Student findLongestName(Student students[])
{

Student longName=students[0];

for(int i=0;i<students.length;i++)
{

if(students[i].getName().length()>longName.getName().length())
{

longName=students[i];

}

}

return longName;

}




public static String generateCensusReport(Student students[])
{

String report="";

int valid=0;
int invalid=0;



for(int i=0;i<students.length;i++)
{

boolean ok=isValidCitizenship(students[i].getCitizenship());

if(ok)
valid++;
else
invalid++;

}



report=report+"===== Nepal School Census Report =====\n";

report=report+"Total students: "+students.length+"   Valid records: "+valid+"   Invalid: "+invalid+"\n";


report=report+"- Student List -\n";


for(int i=0;i<students.length;i++)
{

String status="";

if(isValidCitizenship(students[i].getCitizenship()))
status="VALID";
else
status="INVALID";


report=report+
students[i].getNameInitials()+" "+
students[i].getName()+
" | "+
students[i].getAge()+
" | Grade "+
students[i].getGrade()+
" | "+
status+"\n";

}



report=report+"- Statistics -\n";


report=report+"Average age: "+averageAge(students)+"\n";


Student s=findLongestName(students);


report=report+"Longest name: "+s.getName()+" ("+s.getName().length()+" chars)\n";



int itahari=0;

for(int i=0;i<students.length;i++)
{

if(students[i].getSchool().equalsIgnoreCase("Itahari Int. College"))
itahari++;

}



report=report+"Itahari Int. College: "+itahari+" students\n";


return report;

}


}