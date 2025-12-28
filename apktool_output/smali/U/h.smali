.class public final LU/h;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# static fields
.field public static final f:LU/h;

.field public static final g:LU/h;

.field public static final h:LU/h;

.field public static final i:LU/h;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, LU/h;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LU/h;-><init>(II)V

    sput-object v0, LU/h;->f:LU/h;

    new-instance v0, LU/h;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LU/h;-><init>(II)V

    sput-object v0, LU/h;->g:LU/h;

    new-instance v0, LU/h;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LU/h;-><init>(II)V

    sput-object v0, LU/h;->h:LU/h;

    new-instance v0, LU/h;

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LU/h;-><init>(II)V

    sput-object v0, LU/h;->i:LU/h;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, LU/h;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LU/h;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LU/q;

    invoke-static {p1}, LU/c;->B(LU/q;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, LU/a;

    iget p1, p1, LU/a;->a:I

    sget-object p1, LU/n;->b:LU/n;

    return-object p1

    :pswitch_1
    check-cast p1, LU/a;

    iget p1, p1, LU/a;->a:I

    sget-object p1, LU/n;->b:LU/n;

    return-object p1

    :pswitch_2
    check-cast p1, LU/i;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LU/i;->b(Z)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
