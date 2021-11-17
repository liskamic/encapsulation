package encapsulation.client;

import encapsulation.implementation.PublicComposedClass;

public class UserOfComposedPublicClass {

    private PublicComposedClass wrapped = new PublicComposedClass();

    public void privateHiddenMethod() {
//        wrapped.privateHiddenMethod(); // Does not exist
    }

    public void packagePrivateHiddenMethod() {
//        wrapped.packagePrivateHiddenMethod(); // Does not exist
        wrapped.composedPackagePrivateHiddenMethod(); // We did consciously CHOOSE to expose this in public class (for whatever reason)
    }

    public void protectedHiddenMethod() {
//        wrapped.protectedHiddenMethod(); // Does not exist
//        wrapped.composedProtectedHiddenMethod(); // Compilation error because we did NOT want to expose it outside of package
    }

    public void publicHiddenMethod() {
//        wrapped.publicHiddenMethod(); // Does not exist
//        wrapped.composedPublicHiddenMethod(); // Does not exist
    }

}
