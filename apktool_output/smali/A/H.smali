.class public abstract LA/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/M0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LA/p;->n:LA/p;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, LA/H;->a:LD/M0;

    return-void
.end method

.method public static final a(ILD/n;)LW/H;
    .locals 3

    sget-object v0, LA/H;->a:LD/M0;

    invoke-virtual {p1, v0}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/G;

    invoke-static {p0}, Lp/f;->b(I)I

    move-result p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :pswitch_0
    iget-object p0, p1, LA/G;->b:Lv/d;

    goto :goto_0

    :pswitch_1
    sget-object p0, LW/D;->a:LX1/e;

    goto :goto_0

    :pswitch_2
    iget-object p0, p1, LA/G;->c:Lv/d;

    goto :goto_0

    :pswitch_3
    iget-object p0, p1, LA/G;->d:Lv/d;

    invoke-static {p0}, LA/H;->b(Lv/d;)Lv/d;

    move-result-object p0

    goto :goto_0

    :pswitch_4
    iget-object p0, p1, LA/G;->d:Lv/d;

    const-wide/16 v0, 0x0

    double-to-float p1, v0

    new-instance v0, Lv/b;

    invoke-direct {v0, p1}, Lv/b;-><init>(F)V

    new-instance v1, Lv/b;

    invoke-direct {v1, p1}, Lv/b;-><init>(F)V

    const/4 p1, 0x6

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, p1}, Lv/d;->a(Lv/d;Lv/b;Lv/b;Lv/b;I)Lv/d;

    move-result-object p0

    goto :goto_0

    :pswitch_5
    iget-object p0, p1, LA/G;->d:Lv/d;

    goto :goto_0

    :pswitch_6
    sget-object p0, Lv/e;->a:Lv/d;

    goto :goto_0

    :pswitch_7
    iget-object p0, p1, LA/G;->a:Lv/d;

    invoke-static {p0}, LA/H;->b(Lv/d;)Lv/d;

    move-result-object p0

    goto :goto_0

    :pswitch_8
    iget-object p0, p1, LA/G;->a:Lv/d;

    goto :goto_0

    :pswitch_9
    iget-object p0, p1, LA/G;->e:Lv/d;

    invoke-static {p0}, LA/H;->b(Lv/d;)Lv/d;

    move-result-object p0

    goto :goto_0

    :pswitch_a
    iget-object p0, p1, LA/G;->e:Lv/d;

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lv/d;)Lv/d;
    .locals 4

    const-wide/16 v0, 0x0

    double-to-float v0, v0

    new-instance v1, Lv/b;

    invoke-direct {v1, v0}, Lv/b;-><init>(F)V

    new-instance v2, Lv/b;

    invoke-direct {v2, v0}, Lv/b;-><init>(F)V

    const/4 v0, 0x3

    const/4 v3, 0x0

    invoke-static {p0, v3, v2, v1, v0}, Lv/d;->a(Lv/d;Lv/b;Lv/b;Lv/b;I)Lv/d;

    move-result-object p0

    return-object p0
.end method
