from factory.IdentifiableElement import IdentifiableElement
class FactorySpecification(IdentifiableElement):
	def __init__(self):
		super(FactorySpecification,self).__init__()
		self.business_type_name = None
		self.owned_factories = []
		self.owned_employees = []
		self.owned_product_parts = []
		self.owned_products = []

