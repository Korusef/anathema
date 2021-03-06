package net.sf.anathema.lib.workflow.wizard.selection;

import net.sf.anathema.lib.gui.wizard.IAnathemaWizardPage;

public interface IWizardFactory {

  public boolean needsFurtherDetails();

  public IAnathemaWizardPage createPage(IAnathemaWizardModelTemplate template);

  public IAnathemaWizardModelTemplate createTemplate();
}