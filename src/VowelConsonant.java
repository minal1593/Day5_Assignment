//Java Program to Check Whether an Alphabet is Vowel or Consonant
class VowelConsonant
{


    public static void main(String[] args) {

        char ch='a';

        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
