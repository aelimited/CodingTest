package JavaTest;

public class SuJ {
    public static void main(String[] args) {
        String control= "wsdawsdassw";//{"w","s","d","a","w","s","d","a","s","s","w"};
        int n=0;
        int answer=n;
        char[] control_char=control.toCharArray();
        //String[] control_char=control.split("");

       /* for(int i = 0; i<control_char.length; i++){
            if(control_char[i].equals("w")){
                answer+=1;
            }
            else if(control_char[i].equals("s")){
                answer-=1;
            }
            else if(control_char[i].equals("d")){
                answer+=10;
            }
            else if(control_char[i].equals("a")){
                answer-=10;
            }
        }
       // return answer;
        System.out.println(answer);
        
        */
        for(int i=0;i<control_char.length;i++){
          //  System.out.println(control_char[i]+"");
            char c=control_char[i];
            if(c=='w'){
                n+=1;
                System.out.println(control_char[i] +"\t" + n);
            } else if (c=='s') {
                n-=1;
                System.out.println(control_char[i] +"\t" + n);

            } else if (c=='d') {
                n+=10;
                System.out.println(control_char[i] +"\t" + n);

            }  else if (c=='a'){
                n-=10;
                System.out.println(control_char[i] +"\t" + n);

            }
        }
        answer = n;
        System.out.println(answer);

    }

    }
