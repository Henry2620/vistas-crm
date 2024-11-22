import jakarta.persistence.*

@Entity
@Table(name = "customer_activity_view")
class CustomerActivityView {
    @Id
    @Column(name = "activity_id")
    var activityId: Long? = null

    @Column(name = "customer_id")
    var customerId: Long? = null

    @Column(name = "customer_name")
    var customerName: String? = null

    @Column(name = "activity_name")
    var activityName: String? = null

    @Column(name = "activity_date")
    var activityDate: String? = null
}
