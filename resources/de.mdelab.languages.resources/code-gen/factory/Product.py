from factory.IdentifiableElement import IdentifiableElement
class Product(IdentifiableElement):
	def __init__(self):
		super(Product,self).__init__()
		self.production_start_year = None
		self.production_end_year = None
		self.image_path = None
		self.owned_product_versions = []

