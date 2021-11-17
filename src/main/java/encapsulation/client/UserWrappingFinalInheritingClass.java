package encapsulation.client;

//import encapsulation.implementation.HiddenClass; // not visible

import encapsulation.implementation.PublicFinalInheritingClass;

//public class UserWrappingFinalInheritingClass extends PublicFinalInheritingClass { // cannot extend a final class
public class UserWrappingFinalInheritingClass {

//    private HiddenClass wrapped = new HiddenClass(); // cannot access HiddenClass from this context
    private PublicFinalInheritingClass wrapped = new PublicFinalInheritingClass();

    public void privateHiddenMethod() {
//        wrapped.privateHiddenMethod(); // Compilation error
    }

    public void packagePrivateHiddenMethod() {
//        wrapped.packagePrivateHiddenMethod(); // Compilation error
        wrapped.exposedPackagePrivateHiddenMethod(); // We did consciously CHOOSE to expose this in public class (for whatever reason)
    }

    public void protectedHiddenMethod() {
//        wrapped.protectedHiddenMethod(); // Compilation error
//        wrapped.composedProtectedHiddenMethod(); // Does not exist since we did NOT choose to expose protectedHiddenMethod()
                                                   // from the implementation package
    }

    public void publicHiddenMethod() {
        wrapped.publicHiddenMethod(); // We have access to HiddenClass.publicHiddenMethod() because our wrapped object
                                      // is a PUBLIC CLASS that extends HiddenClass and the INHERITED METHOD is also PUBLIC
        // => Making our public (entry point) class final thus DOES NOT (completely) PREVENT encapsulation leak caused by inheritance!
        // We either have to make sure NO CLASS nor METHOD in the implementation package is declared public,
        // except the public final class (entry point) and its method (and obviously equals(), hashCode(), toString())...
        // or
        // PROVIDE IMPLEMENTATION EXCLUSIVELY VIA COMPOSITION

        // or upgrade to Java 9 and use Jigsaw for better encapsulation ¯\_(ツ)_/¯
    }

}
