package pl.edu.ur.main;
import java.util.*;
/**
 *
 * @author marcin
 * @author Mateusz Borkowski
**/
public class zadania{

        public static void Zadanie3() {
        Scanner klawiatura=new Scanner(System.in);
        
        System.out.println("Zadanie numer 3 : \t");
        System.out.println("Podaj 10 liczb : ");        
        double liczby[]= new double[10];
        int i;
        for(i=0; i<liczby.length; i++)
        {
            liczby[i]=klawiatura.nextDouble();
        }
        
        System.out.println("Podaj numer zadania : \t");
        System.out.println("1.Sortowanie od pierwszego do ostatniego ideksu : \t");
        System.out.println("2.Sortowanie od ostaniego do pierwszego ideksu : \t");
        System.out.println("3.Sortowanie wg nieparzystych ideksów : \t");
        System.out.println("4.Sortowanie wg parzystych ideksów  : \t");

        int n = klawiatura.nextInt();
        
        if(n==1) // od pierwszego do ostatniego
        {
           for(i=0; i<liczby.length; i++)
           {
           System.out.println("Numer : " + i + "\t" + "Wartosc :" + liczby[i]);
           }
        
        }
        else if(n==2) // od ostatniego do pierwszego
        {
        for(i=0; i>=0; i--)
           {
           System.out.println("Numer : " + i + "\t" + "Wartosc :" + liczby[i]);
           }
        }
        else if(n==3) // nieparzyste
        {
        for(i=1;i<liczby.length; i=i+2)
        {
        System.out.println("Numer : " + i + "\t" + "Wartosc :" + liczby[i]);
        }           
        }
        else if(n==4)// parzyste
        {
        for(i=0;i<liczby.length; i=i+2)
        {
        System.out.println("Numer : " + i + "\t" + "Wartosc :" + liczby[i]);
        }
        }
        else
        {
        System.out.println("Podana wartość nie istnieje");
        }
        }
        
        
     
    
        public static void Zadanie4() {
        
        Scanner klawiatura=new Scanner(System.in);
        
        System.out.println("Zadanie numer 4 : \t");
        System.out.println("Podaj numer zadania : \t");
        System.out.println("1.Suma wszystkich elemntów : \t");
        System.out.println("2.Iloczyn wszystkich elementów : \t");
        System.out.println("3.Srednia wszystkich elementów : \t");
        System.out.println("4.Minimalna wartość elementów : \t");
        System.out.println("5.Maksymalna wartość elementów : \t");

        System.out.println("Podaj 10 liczb : ");        
        double liczby[]= new double[10];
        double suma = 0;
        long iloczyn = 0;
        double srednia;
 
        int i;
        for(i=0; i<liczby.length; i++)
        {
            System.out.println(i + " liczba : ");
            liczby[i]=klawiatura.nextDouble();
        }
        
        System.out.println("Podaj podpunkt zadania : (1-4) \t");
        int n = klawiatura.nextInt();
        
        if(n==1) // suma
        {
         for(i=0;i<liczby.length;i++)
         {
         suma+=liczby[i];
         System.out.println("Suma elementów to : "+ suma);
         }
        
        }
        else if(n==2) //iloczyn
        {
          for(i=0;i<liczby.length;i++)
          {
           iloczyn*=liczby[i];    
           System.out.println("Iloczyn elementów to : "+iloczyn);
          }
        } 
        else if(n==3)  // srednia
        {
          for(i=0;i<liczby.length;i++)
          { 
           suma+=liczby[i];
           srednia=suma/liczby.length;
           System.out.println("Srednia elemntów to : "+ srednia);
          }
            
        }
        else if(n==4) // min
        {
        double min=liczby[0];
        for(i=0;i<liczby.length;i++)
        {
            if(min>liczby[i])
            {
            min=liczby[i];
            }
        }
        System.out.println("Minimalna wartość tablicy to : "+ min);
        }
        else // max
        {
        double max=liczby[0];
        for(i=0;i<liczby.length;i++)
        {
            if(max<liczby[i])
            {
                max=liczby[i];
            }
        }
        System.out.println("Maximum wartości tablicy to : "+ max);
        }
}

              

    
        public static void Zadanie6(){
        
        Scanner liczba=new Scanner(System.in);
        System.out.println("Wprowadź liczbę : ");
        while(true)
        {
            int l=liczba.nextInt();
            if(l<0)
            {
            System.out.println("Wprowadziłeś liczbę < 0 . Koniec programu.");
                  break;
            }
            
        
        }
        }
        
        public static void Zadanie7(){
        
        Scanner metoda=new Scanner(System.in);
        System.out.println("Podaj ilość elementów do posortwoania : ");
        int ilosc,liczba,ile,zmiana,indeksy,pomocnicza;
        ilosc=metoda.nextInt();
        int tab[]=new int[ilosc];
        for(int i=0;i<tab.length;i++)
        {
        System.out.println("Podaj liczby : ");
        tab[i]=metoda.nextInt();
        }
        
        do
        {
            zmiana=0; 
            indeksy=ilosc-1;
            do
            {
            indeksy--;
            if(tab[indeksy+1]<tab[indeksy])
            {
            pomocnicza=tab[indeksy];
            
            tab[indeksy]=tab[indeksy+1];
            tab[indeksy+1]=pomocnicza;
            zmiana=1;
            }
            
            }
            while(indeksy!=0);
            
        } while(zmiana!=0);
        System.out.println("Tablica po posortowaniu:");
        
        for(int i=0; i<ilosc; i++)
        {
        System.out.println(tab[i]);
        }
        
        
        }
}


