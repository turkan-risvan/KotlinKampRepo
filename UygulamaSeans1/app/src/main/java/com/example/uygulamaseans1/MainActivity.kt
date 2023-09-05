MainActivity: AppCompatActivity() ( private val userAdapter: UserAdapter

UserAdapter()

private lateinit var binding:

        ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?)

{ binding ActivityMainBinding. inflate (layoutInflater) super.onCreate(savedInstanceState) setContentView(binding.root)

    binding.recyclerAdapter.layoutManager LinearLayoutManager(this LinearLayoutManager. VERTICAL, false)

    binding.recyclerAdapter.adapter userAdapter

    val list mutableListof<User>()

    val

    name listof<String>("Ali"

        , "Mehmet", "Selami", "Cabbar",

        "Melicat")

    repeat (100) (

        val randomName Random.nextInt(0..4)

    list.add(User(id

        "0", name

                name (randomName]

    ,

    , password-

        userAdapter.submitlist (list)