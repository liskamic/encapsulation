package encapsulation.implementation;

public final class PublicComposedClass {

    private HiddenClass encapsulatedHiddenClass = new HiddenClass();

    public void composedPackagePrivateHiddenMethod() {
        encapsulatedHiddenClass.packagePrivateHiddenMethod(); // In a public CLASS, we can expose any non-private method of HiddenClass
                                                              // using composition
    }

    private void composedProtectedHiddenMethod() {
        encapsulatedHiddenClass.protectedHiddenMethod(); // Sure, we can access a protected method from the same package
                                                         // but we can CHOOSE NOT to expose it
    }

}
