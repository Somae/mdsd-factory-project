Gendoc template generation steps:

1. Open documentation/templates/template_factory.docx in Word
2. Press Ctrl + H
   Search for "$ProjectFolder$"
   Replace all occurences with the path to the resource project folder (the path to the folder that contains this README.txt)
   Save changes
3. Generate documentation with Genoc using the template.
   The output should be in "documentation/factory_template_generated.docx".
4. Open the generated file in Word
5. Press Ctrl + P
   Press ESC
   Select the table of contens -> Press F9 -> Renew whole table of contents
   Select table of figures -> Press F9
6. Done =)


The references within the text pointing to figures are broken. Gendoc support for generating references is needed to do it properly. For now they are pointing to the last figure generated within a for loop in the Gendoc template.