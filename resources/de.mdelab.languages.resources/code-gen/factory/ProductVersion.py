from factory.IdentifiableElement import IdentifiableElement
class ProductVersion(IdentifiableElement):
	def __init__(self):
		super(ProductVersion,self).__init__()
		self.description = None
		self.version_start_year = None
		self.version_end_year = None

