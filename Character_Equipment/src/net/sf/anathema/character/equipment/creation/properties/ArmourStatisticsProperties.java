package net.sf.anathema.character.equipment.creation.properties;

import net.disy.commons.core.message.BasicMessage;
import net.disy.commons.core.message.IBasicMessage;
import net.disy.commons.core.message.MessageType;
import net.sf.anathema.lib.resources.IResources;

public class ArmourStatisticsProperties extends EquipmentStatisticsProperties {

  public ArmourStatisticsProperties(IResources resources) {
    super(resources);
  }
  
  public IBasicMessage getPositiveMobilityPenaltyMessage() {
    return new BasicMessage("Mobility penalties should be negative numbers.", MessageType.WARNING);
  }

  public String getBashingSoakLabel() {
    return "Bashing Soak:";
  }

  public String getLethalSoakLabel() {
    return "Lethal Soak:";
  }

  public String getBashingHardnessLabel() {
    return "Bashing Hardness:";
  }

  public String getLethalHardnessLabel() {
    return "Lethal Hardness:";
  }

  public String getMobilityPenaltyLabel() {
    return "Mobility Penalty:";
  }

  public String getFatigueLabel() {
    return "Fatigue:";
  }
}