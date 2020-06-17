package dot.bpm.parser.internal;

import dot.bpm.core.Attribute;
import dot.bpm.core.Attributes;
import dot.bpm.core.QualifiedName;
import dot.bpm.parser.antlr.DOTBPMParser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

class AttributeParser {

    private static final Pattern numberPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private static final Pattern booleanPattern = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);

    static Attributes parse(DOTBPMParser.Attr_listContext attributeListCtx) {
        Collection<Attribute<?>> attrs = new ArrayList<>();
        for (int i = 0; i < attributeListCtx.getChildCount(); i++) {
            DOTBPMParser.AttributeContext attrContext = attributeListCtx.attribute(i);
            Object attrValue = parseValue(attrContext.attr_value().getText());
            new Attribute<>(getAttributeName(attrContext), attrValue);
        }
        return new Attributes(attrs);
    }

    private static QualifiedName getAttributeName(DOTBPMParser.AttributeContext attrCtx) {
        if (attrCtx.id() != null) {
            return new QualifiedName(attrCtx.id().getText());
        } else {
            String namespaceId = attrCtx.namespace_id().getText();
            String[] parts = namespaceId.split(":", 2);
            return new QualifiedName(parts[0], parts[1]);
        }
    }

    private static Object parseValue(String strValue) {
        if (numberPattern.matcher(strValue).matches()) {
            return Double.parseDouble(strValue);
        } else if (booleanPattern.matcher(strValue).matches()) {
            return Boolean.parseBoolean(strValue);
        }
        // time/date values, etc.
        return strValue;
    }
}
