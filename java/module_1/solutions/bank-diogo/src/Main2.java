import com.bank_accounts.bank.ImmutableObject;

public final class Main2 {

    public static void main(String[] args) {

        final ImmutableObject immutableObject;// = new ImmutableObject("Tomas","Aquilino");//im -> 0xff0;
        immutableObject = new ImmutableObject("Pedro","Aquilino");
        immutableObject.setChangeMe("QQ coisa");


        ImmutableObject immutableObject2 = new ImmutableObject("Pedro","Aquilino"); //im -> 0xff1;
        immutableObject.setChangeMe("QQ coisa");
        immutableObject2 = new ImmutableObject("Joaquim","Aquilino"); //im -> 0xff2;

        immutableObject.setChangeMe("QQ coisa");

    }
}
