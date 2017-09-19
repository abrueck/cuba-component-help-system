package de.balvi.cuba.helpsystem.web.action

import com.haulmont.cuba.gui.components.Window
import de.balvi.cuba.declarativecontrollers.web.editor.EditorAnnotationExecutor
import org.springframework.stereotype.Component

import javax.inject.Inject
import java.lang.annotation.Annotation

@Component
class HelpAnnotationEditorExecutor implements EditorAnnotationExecutor<HasHelp> {

    @Inject
    HelpRenderer contextHelpRenderer

    @Override
    void init(HasHelp annotation, Window.Editor editor, Map<String, Object> params) {

    }

    @Override
    void postInit(HasHelp annotation, Window.Editor editor) {
        contextHelpRenderer.initComponent(editor.frame)
    }

    @Override
    boolean supports(Annotation annotation) {
        annotation instanceof HasHelp
    }
}
