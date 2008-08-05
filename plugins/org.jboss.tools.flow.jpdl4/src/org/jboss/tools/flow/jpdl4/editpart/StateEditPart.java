package org.jboss.tools.flow.jpdl4.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.jboss.tools.flow.common.editpart.ElementEditPart;
import org.jboss.tools.flow.common.figure.RoundedRectangleElementFigure;
import org.jboss.tools.flow.jpdl4.Activator;

public class StateEditPart extends ElementEditPart {

    private static final Image ICON = ImageDescriptor.createFromURL(
        Activator.getDefault().getBundle().getEntry("icons/state.gif")).createImage();
    private static final Color COLOR = new Color(Display.getCurrent(), 255, 250, 205);
    
    protected IFigure createFigure() {
        RoundedRectangleElementFigure figure = new RoundedRectangleElementFigure();
        figure.setIcon(ICON);
        figure.setColor(COLOR);
        return figure;
    }
    
}