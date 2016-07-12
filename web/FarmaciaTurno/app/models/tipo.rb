class Tipo < ActiveRecord::Base
   has_and_belongs_to_many :farmacia
end
