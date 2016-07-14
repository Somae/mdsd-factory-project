from factory.IdentifiableElement import IdentifiableElement
class Factory(IdentifiableElement):
	def __init__(self):
		super(Factory,self).__init__()
		self.description = None
		self.street_number = None
		self.street = None
		self.city = None
		self.postal_code = None
		self.country = None
		self.length = None
		self.width = None
		self.production_schemata = []
		self.employees = []
		self.machines = []
		self.created_product_parts = []
		self.owned_machines = []

