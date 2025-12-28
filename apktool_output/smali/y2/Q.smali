.class public final Ly2/Q;
.super Ly2/W;
.source "SourceFile"


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ly2/Q;->h:I

    invoke-direct {p0}, LD2/k;-><init>()V

    iput-object p2, p0, Ly2/Q;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ly2/Q;->h:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ly2/Q;->p(Ljava/lang/Throwable;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ly2/Q;->p(Ljava/lang/Throwable;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ly2/Q;->p(Ljava/lang/Throwable;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 2

    iget v0, p0, Ly2/Q;->h:I

    packed-switch v0, :pswitch_data_0

    sget-object p1, Lc2/m;->a:Lc2/m;

    iget-object v0, p0, Ly2/Q;->i:Ljava/lang/Object;

    check-cast v0, Ly2/f;

    invoke-virtual {v0, p1}, Ly2/f;->t(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Ly2/W;->o()Ly2/b0;

    move-result-object p1

    invoke-virtual {p1}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ly2/m;

    iget-object v1, p0, Ly2/Q;->i:Ljava/lang/Object;

    check-cast v1, Ly2/X;

    if-eqz v0, :cond_0

    check-cast p1, Ly2/m;

    iget-object p1, p1, Ly2/m;->a:Ljava/lang/Throwable;

    invoke-static {p1}, LZ0/d;->q(Ljava/lang/Throwable;)Lc2/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Ly2/f;->t(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ly2/v;->q(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Ly2/f;->t(Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Ly2/Q;->i:Ljava/lang/Object;

    check-cast v0, Lo2/c;

    invoke-interface {v0, p1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
