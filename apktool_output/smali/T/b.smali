.class public final LT/b;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ll0/o;


# direct methods
.method public synthetic constructor <init>(Ll0/o;I)V
    .locals 0

    iput p2, p0, LT/b;->e:I

    iput-object p1, p0, LT/b;->f:Ll0/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LT/b;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/n;

    iget-object v0, p0, LT/b;->f:Ll0/o;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1}, Ll0/n;->d(Ll0/n;Ll0/o;II)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/n;

    iget-object v0, p0, LT/b;->f:Ll0/o;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1}, Ll0/n;->d(Ll0/n;Ll0/o;II)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_1
    check-cast p1, Ll0/n;

    iget-object v0, p0, LT/b;->f:Ll0/o;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1}, Ll0/n;->f(Ll0/n;Ll0/o;II)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_2
    check-cast p1, Ll0/n;

    iget-object v0, p0, LT/b;->f:Ll0/o;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1}, Ll0/n;->f(Ll0/n;Ll0/o;II)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_3
    check-cast p1, Ll0/n;

    iget-object v0, p0, LT/b;->f:Ll0/o;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1}, Ll0/n;->f(Ll0/n;Ll0/o;II)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_4
    check-cast p1, Ll0/n;

    iget-object v0, p0, LT/b;->f:Ll0/o;

    invoke-static {p1, v0}, Ll0/n;->g(Ll0/n;Ll0/o;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_5
    check-cast p1, Ll0/n;

    iget-object v0, p0, LT/b;->f:Ll0/o;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1}, Ll0/n;->f(Ll0/n;Ll0/o;II)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
