.class public final LN/n;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lp2/h;


# direct methods
.method public constructor <init>(ILo2/c;)V
    .locals 0

    iput p1, p0, LN/n;->e:I

    packed-switch p1, :pswitch_data_0

    check-cast p2, Lp2/h;

    iput-object p2, p0, LN/n;->f:Lp2/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void

    :pswitch_0
    check-cast p2, Lp2/h;

    iput-object p2, p0, LN/n;->f:Lp2/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, LN/n;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object v0, p0, LN/n;->f:Lp2/h;

    invoke-interface {v0, p1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, LN/l;

    iget-object v0, p0, LN/n;->f:Lp2/h;

    invoke-interface {v0, p1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LN/h;

    sget-object v0, LN/o;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LN/o;->c:LN/l;

    invoke-virtual {p1}, LN/h;->d()I

    move-result v2

    invoke-virtual {v1, v2}, LN/l;->e(I)LN/l;

    move-result-object v1

    sput-object v1, LN/o;->c:LN/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
