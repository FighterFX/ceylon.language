 package ceylon.language;

import com.redhat.ceylon.compiler.java.metadata.Annotation;
import com.redhat.ceylon.compiler.java.metadata.Annotations;
import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.SatisfiedTypes;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;

@Ceylon(major = 1)
@TypeParameters(@TypeParameter(value = "Element", variance = Variance.OUT))
@SatisfiedTypes({
    "ceylon.language.List<Element>",
    "ceylon.language.Some<Element>",
    "ceylon.language.Ranged<ceylon.language.Integer,ceylon.language.Empty|ceylon.language.Sequence<Element>>",
    "ceylon.language.Cloneable<ceylon.language.Sequence<Element>>"
})
public interface Sequence<Element> 
        extends List<Element>, Some<Element> {
    
    @Annotations({@Annotation("actual"), @Annotation("default")})
    @Override
    @TypeInfo("ceylon.language.Integer")
    public Integer getLastIndex();
    
    @Annotations({@Annotation("actual"), @Annotation("formal")})
    @Override
    public Element getFirst();
    
    @Annotations(@Annotation("default"))
    public Element getLast();

    @Annotations({@Annotation("actual"), @Annotation("formal")})
    @Override
    @TypeInfo("ceylon.language.Empty|ceylon.language.Sequence<Element>")
    public FixedSized<? extends Element> getRest();
    
    @Annotations({@Annotation("actual"), @Annotation("formal")})
    @Override
    public Sequence<? extends Element> getReversed();
    
    /*@Override
    @TypeInfo("ceylon.language.Empty|ceylon.language.Sequence<Element>")
    public List<? extends Element> span(@Name("from") Integer from, 
            @TypeInfo("ceylon.language.Nothing|ceylon.language.Integer")
            @Name("to") Integer to);
    
    @Override
    @TypeInfo("ceylon.language.Empty|ceylon.language.Sequence<Element>")
    public List<? extends Element> segment(@Name("from") Integer from, 
            @Name("length") Integer length);*/
    
}
