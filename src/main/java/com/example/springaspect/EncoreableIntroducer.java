package com.example.springaspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value="com.example.springaspect.Performance+",defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
