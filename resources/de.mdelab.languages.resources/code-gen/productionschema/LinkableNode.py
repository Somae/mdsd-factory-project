from productionschema.IdentifiableElement import IdentifiableElement
class LinkableNode(IdentifiableElement):
	def __init__(self):
		super(LinkableNode,self).__init__()
		self.incoming_links = []
		self.outgoing_links = []
	def degree(self,is_in_degree,is_out_degree):
		#Start of user code degree
		pass
		#End of user code
