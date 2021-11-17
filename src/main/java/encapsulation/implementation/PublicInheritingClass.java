package encapsulation.implementation;

public class PublicInheritingClass extends HiddenClass {

    public void exposedPackagePrivateHiddenMethod() {
        super.packagePrivateHiddenMethod(); // We can expose any non-private method this way if we choose to for whatever reason
    }

}
