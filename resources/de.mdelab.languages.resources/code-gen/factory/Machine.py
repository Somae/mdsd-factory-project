from factory.IdentifiableElement import IdentifiableElement
class Machine(IdentifiableElement):
	def __init__(self):
		super(Machine,self).__init__()
		self.x = None
		self.y = None
		self.size = None

