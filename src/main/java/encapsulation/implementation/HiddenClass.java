package encapsulation.implementation;

//private class HiddenClass { // Modifier private not allowed here
//protected class HiddenClass { // Modifier protected not allowed here
//public class HiddenClass { // Only possibility if we forbid package private modifier as our house rule (for classes too because we are zealous!)
class HiddenClass { // We are testing package private encapsulation on the class level

    private void privateHiddenMethod() {}

    void packagePrivateHiddenMethod() {}

    protected void protectedHiddenMethod() {}

    public void publicHiddenMethod() {}

}
