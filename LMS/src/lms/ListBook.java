
package lms;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
public class ListBook {
    private ArrayList<Book> list;
    public ListBook(){
        list=new ArrayList();
        list=getList2();
    }
    public ArrayList<Book> getList(){
        return list;
    }
    public boolean Add(Book b){
        list.add(b);
        updateFile();
        return true;
    }
    public void updateFile(){
        String str="input.txt";
        try{
            FileWriter fos=new FileWriter(str);
            BufferedWriter bos=new BufferedWriter(fos);
            for(Book b:list){
                bos.write(b.Title+","+b.authorName+","+Integer.toString(b.edition)+","+b.publisher+","+
                        b.publishDate+","+b.publisherNumber+","+Integer.toString(b.price)+","+
                        b.authorNumber+","+b.companyName+","+b.id+","+Integer.toString(b.pages)+
                        ","+b.mainArticle+","+b.approvedBy+","+b.articles+","+b.copies+"\n");
            }
            bos.close();
            fos.close();
        }catch(Exception e){}
    }
    public boolean Delete(String title,String aName){
        for(Book b:list){
            if(b.Title.equals(title) && b.authorName.equals(aName)){
                list.remove(b);
                updateFile();
                return true;
            }
        }
        return false;
    }
    public Book getFirstObject(){
        return list.get(0);
    }
    public boolean Edit(String title,String aName,Book b1){
        for(Book b:list){
            if(b.Title.equals(title) && b.authorName.equals(aName)){
                b.Title=b1.Title;
                b.authorName=b1.authorName;
                b.edition=b1.edition;
                b.publisher=b1.publisher;
                b.publishDate=b1.publishDate;
                b.approvedBy=b1.approvedBy;
                b.articles=b1.articles;
                b.id=b1.id;
                b.companyName=b1.companyName;
                b.copies=b1.copies;
                b.pages=b1.pages;
                b.mainArticle=b1.mainArticle;
                b.authorNumber=b1.authorNumber;
                b.publisherNumber=b1.publisherNumber;
                b.price=b1.price;
                updateFile();
                return true;
            }
        }
        return false;
    }
    public Book Navigate(Book b1,boolean flag,ArrayList<Book> list1){
    Book previous=null,next=null,current=null;
        for(int i=0;i<list1.size();i++){
            Book b2=list1.get(i);
            if(i!=0 && i!=list1.size()-1){
                previous=list1.get(i-1);
                next=list1.get(i+1);
                current=b2;
            }
            else if(i==list1.size()-1){
                next=null;
                if(i==0){
                    previous=null;
                }
                else {
                    previous=list1.get(i-1);
                }
                current=b2;
            }
            else if(i==0){
                previous=null;
                if(i==list1.size()-1){
                    next=null;
                }
                else {
                    next=list1.get(i+1);
                }
                current=b2;
            }
            
            if(b1.Title.equals(current.Title) &&
                    b1.authorName.equals(current.authorName) &&
                    b1.edition==current.edition &&
                    b1.publisher.equals(current.publisher) &&
                    b1.publishDate.equals(current.publishDate))break;
        }
        if(flag && next!=null){
            return next;
        }
        else if(flag && next==null){
            return current;
        }
        if(!flag && previous!=null){
            return previous;
        }
        else if(!flag && previous==null){
            return current;
        }
        else return current;
    }
    public Book Navigate(Book b1,boolean flag){
        Book previous=null,next=null,current=null;
        for(int i=0;i<list.size();i++){
            Book b2=list.get(i);
            if(i!=0 && i!=list.size()-1){
                previous=list.get(i-1);
                next=list.get(i+1);
                current=b2;
            }
            else if(i==list.size()-1){
                next=null;
                if(i==0){
                    previous=null;
                }
                else {
                    previous=list.get(i-1);
                }
                current=b2;
            }
            else if(i==0){
                previous=null;
                if(i==list.size()-1){
                    next=null;
                }
                else {
                    next=list.get(i+1);
                }
                current=b2;
            }
            
            if(b1.Title.equals(current.Title) &&
                    b1.authorName.equals(current.authorName) &&
                    b1.edition==current.edition &&
                    b1.publisher.equals(current.publisher) &&
                    b1.publishDate.equals(current.publishDate))break;
        }
        if(flag && next!=null){
            return next;
        }
        else if(flag && next==null){
            return current;
        }
        if(!flag && previous!=null){
            return previous;
        }
        else if(!flag && previous==null){
            return current;
        }
        else return current;
    }
    public ArrayList<Book> Search(String t){
        ArrayList<Book> list2=new ArrayList();
        t=t.toLowerCase();
        String t2;
        for(int i=0;i<list.size();i++){
            Book b2=list.get(i);
            t2=b2.Title.toLowerCase();
            if(t2.contains(t)){
                Book b=new Book();
                b.Title=b2.Title;
                b.authorName=b2.authorName;
                b.edition=b2.edition;
                b.publisher=b2.publisher;
                b.publishDate=b2.publishDate;
                b.approvedBy=b2.approvedBy;
                b.articles=b2.articles;
                b.id=b2.id;
                b.companyName=b2.companyName;
                b.copies=b2.copies;
                b.pages=b2.pages;
                b.mainArticle=b2.mainArticle;
                b.authorNumber=b2.authorNumber;
                b.publisherNumber=b2.publisherNumber;
                b.price=b2.price;
                list2.add(b);
            }
        }
        return list2;
    }
    public ArrayList<Book> getList2(){
        String str="input.txt";
        String []str3=new String[10];
        Book b=new Book();
        try{
            FileReader fis=new FileReader(str);
            BufferedReader bis=new BufferedReader(fis);
            String str2=bis.readLine();
            while(str2!=null){
                str3=str2.split(",+");
                b.Title=str3[0];
                b.authorName=str3[1];
                b.edition=Integer.parseInt(str3[2]);
                b.publisher=str3[3];
                b.publishDate=str3[4];
                b.approvedBy=str3[12];
                b.articles=Integer.parseInt(str3[13]);
                b.id=str3[9];
                b.companyName=str3[8];
                b.copies=Integer.parseInt(str3[14]);
                b.pages=Integer.parseInt(str3[10]);
                b.mainArticle=str3[11];
                b.authorNumber=str3[7];
                b.publisherNumber=str3[5];
                b.price=Integer.parseInt(str3[6]);
                list.add(b);
                b=new Book();
                str2=bis.readLine();
            }
            fis.close();
            bis.close();
            return list;
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }
}
