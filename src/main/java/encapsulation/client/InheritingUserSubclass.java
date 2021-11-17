package encapsulation.client;

//import encapsulation.implementation.HiddenClass; // not visible
import encapsulation.implementation.PublicInheritingClass;

//public class InheritingUserSubclass extends HiddenClass { // ditto
//public class InheritingUserSubclass extends PublicFinalInheritingClass { // cannot extend a final class, so no risk of encapsulation leak (see bellow)
public class InheritingUserSubclass extends PublicInheritingClass {

//    @Override  // This does not override HiddenClass.privateHiddenMethod(), the method is not visible here
    public void privateHiddenMethod() {
//        super.privateHiddenMethod(); // Compilation error
    }

//    @Override  // This does not override HiddenClass.packagePrivateHiddenMethod(), the method is not visible here
    public void packagePrivateHiddenMethod() {
//        super.packagePrivateHiddenMethod(); // Compilation error
    }

    @Override  // This does not override HiddenClass.packagePrivateHiddenMethod(), obviously
    public void exposedPackagePrivateHiddenMethod() {
        super.exposedPackagePrivateHiddenMethod(); // HiddenClass.packagePrivateHiddenMethod() is NOT directly accessible here
    }

    @Override  // This actually DOES overrides HiddenClass.protectedHiddenMethod() => encapsulation leak!
    public void protectedHiddenMethod() {
        super.protectedHiddenMethod(); // HiddenClass.protectedHiddenMethod() IS accessible via transitive inheritance => encapsulation leak!
    }

    @Override  // This actually DOES overrides HiddenClass.protectedHiddenMethod() => encapsulation leak!
    public void publicHiddenMethod() {
        super.publicHiddenMethod(); // HiddenClass.protectedHiddenMethod() IS accessible via transitive inheritance => encapsulation leak!
    }

}
