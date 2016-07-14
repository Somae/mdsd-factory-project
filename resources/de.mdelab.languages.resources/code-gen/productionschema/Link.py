from productionschema.IdentifiableElement import IdentifiableElement
class Link(IdentifiableElement):
	def __init__(self):
		super(Link,self).__init__()
		self.source_node = None
		self.destination_node = None
		self.associated_material = None
