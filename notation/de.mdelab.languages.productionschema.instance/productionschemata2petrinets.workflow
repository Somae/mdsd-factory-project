<?xml version="1.0" encoding="UTF-8"?>
<workflow:Workflow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:mltgg.mote2.workflowComponent="http://www.mdelab.de/mltgg/mote2/workflowComponent/1.0" xmlns:workflow="http://mdelab/workflow/1.0" xmlns:workflow.components="http://mdelab/workflow/components/1.0" xmi:id="_DjQ1ED-MEeK2N-U9UdKF1Q" name="test SDL2UML Transformation" description="Execute the example SDL to UML model transformation. Note that plugin de.mdelab.mltgg.sdl2uml must be installed in the Eclipse platform">
  <components xsi:type="workflow.components:ModelReader" xmi:id="_4By6YCsIEeWY-_V6HajtuA" name="modelReader" modelSlot="input" modelURI="platform:/resource/de.mdelab.languages.productionschema.instance/Amazon_Wheel_Production.productionschema"/>
  <components xsi:type="mltgg.mote2.workflowComponent:Mote2Transformer" xmi:id="_SLnLoCr4EeWYyrAQ01CZ7A" name="mote2Transformer" tggID="productionschema2petrinet">
    <leftModelSlots>input</leftModelSlots>
    <rightModelSlots>output</rightModelSlots>
  </components>
  <components xsi:type="workflow.components:ModelWriter" xmi:id="_5y4WICsLEeWY-_V6HajtuA" name="modelWriter" modelSlot="output" modelURI="platform:/resource/de.mdelab.languages.productionschema.instance/Amazon_Wheel_Production.pnml"/>
  <components xsi:type="workflow.components:ModelReader" xmi:id="_7t0kwEjwEeaN-OfQIDA9Sg" name="modelReader" modelSlot="input" modelURI="platform:/resource/de.mdelab.languages.productionschema.instance/Brake_Caliper_Production.productionschema"/>
  <components xsi:type="mltgg.mote2.workflowComponent:Mote2Transformer" xmi:id="_7t0kwUjwEeaN-OfQIDA9Sg" name="mote2Transformer" tggID="productionschema2petrinet">
    <leftModelSlots>input</leftModelSlots>
    <rightModelSlots>output</rightModelSlots>
  </components>
  <components xsi:type="workflow.components:ModelWriter" xmi:id="_7t0kwkjwEeaN-OfQIDA9Sg" name="modelWriter" modelSlot="output" modelURI="platform:/resource/de.mdelab.languages.productionschema.instance/Brake_Caliper_Production.pnml"/>
  <components xsi:type="workflow.components:ModelReader" xmi:id="_B2wR4EjxEeaN-OfQIDA9Sg" name="modelReader" modelSlot="input" modelURI="platform:/resource/de.mdelab.languages.productionschema.instance/Brake_Disc_Production.productionschema"/>
  <components xsi:type="mltgg.mote2.workflowComponent:Mote2Transformer" xmi:id="_B2w48EjxEeaN-OfQIDA9Sg" name="mote2Transformer" tggID="productionschema2petrinet">
    <leftModelSlots>input</leftModelSlots>
    <rightModelSlots>output</rightModelSlots>
  </components>
  <components xsi:type="workflow.components:ModelWriter" xmi:id="_B2w48UjxEeaN-OfQIDA9Sg" name="modelWriter" modelSlot="output" modelURI="platform:/resource/de.mdelab.languages.productionschema.instance/Brake_Disc_Production.pnml"/>
  <components xsi:type="workflow.components:ModelReader" xmi:id="_GeeD4EjxEeaN-OfQIDA9Sg" name="modelReader" modelSlot="input" modelURI="platform:/resource/de.mdelab.languages.productionschema.instance/Trabant_601_Wheel_Production.productionschema"/>
  <components xsi:type="mltgg.mote2.workflowComponent:Mote2Transformer" xmi:id="_GeeD4UjxEeaN-OfQIDA9Sg" name="mote2Transformer" tggID="productionschema2petrinet">
    <leftModelSlots>input</leftModelSlots>
    <rightModelSlots>output</rightModelSlots>
  </components>
  <components xsi:type="workflow.components:ModelWriter" xmi:id="_GeeD4kjxEeaN-OfQIDA9Sg" name="modelWriter" modelSlot="output" modelURI="platform:/resource/de.mdelab.languages.productionschema.instance/Trabant_601_Wheel_Production.pnml"/>
</workflow:Workflow>
