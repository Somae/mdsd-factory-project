from factory.IdentifiableElement import IdentifiableElement
class ProductPart(IdentifiableElement):
	def __init__(self):
		super(ProductPart,self).__init__()
		self.image_path = None
		self.supported_product_versions = []
		self.construction_processes = []

