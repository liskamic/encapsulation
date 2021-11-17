package encapsulation.implementation;

public class PublicOverridingClass extends HiddenClass {

//    @Override  // This does not override HiddenClass.privateHiddenMethod(), obviously
    public void privateHiddenMethod() {
//        super.privateHiddenMethod()  // Compilation error
    }

    @Override  // Makes scope public, but we cannot directly access implementation of HiddenClass.packagePrivateHiddenMethod() from the outside
    public void packagePrivateHiddenMethod() { // The method exposed this way outside the package should probably be named differently
                                               // but that's mostly semantics
        super.packagePrivateHiddenMethod(); // This is legitimate in the context of PublicInheritingClass extending a HiddenClass
    }

    @Override  // Makes scope public, but we cannot directly access implementation of HiddenClass.protectedHiddenMethod()
    public void protectedHiddenMethod() { // The method exposed this way outside the package should probably be named differently
                                          // but that's mostly semantics
        super.protectedHiddenMethod(); // This is legitimate in the context of PublicInheritingClass extending a HiddenClass
    }

    @Override // Exposes public method of an implementation class, but we cannot directly access implementation of HiddenClass.publicHiddenMethod()
    public void publicHiddenMethod() { // The method exposed this way outside the package should probably be named differently
                                       // but that's mostly semantics
        super.publicHiddenMethod(); // This is legitimate in the context of PublicInheritingClass extending a HiddenClass
    }

}
