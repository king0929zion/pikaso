.class public final LG1/a;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# static fields
.field public static final f:LG1/a;

.field public static final g:LG1/a;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, LG1/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LG1/a;-><init>(II)V

    sput-object v0, LG1/a;->f:LG1/a;

    new-instance v0, LG1/a;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LG1/a;-><init>(II)V

    sput-object v0, LG1/a;->g:LG1/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, LG1/a;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lc2/m;->a:Lc2/m;

    const/4 v1, 0x2

    iget v2, p0, LG1/a;->e:I

    packed-switch v2, :pswitch_data_0

    check-cast p1, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    if-ne p2, v1, :cond_1

    invoke-virtual {p1}, LD/n;->y()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LD/n;->K()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p2, LG1/c;->a:LL/a;

    const/16 p2, 0xc00

    const/4 v1, 0x0

    invoke-static {v1, v1, v1, p1, p2}, LA/y;->a(LA/o;LA/G;LA/P;LD/n;I)V

    :goto_1
    return-object v0

    :pswitch_0
    check-cast p1, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    if-ne p2, v1, :cond_3

    invoke-virtual {p1}, LD/n;->y()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, LD/n;->K()V

    goto :goto_3

    :cond_3
    :goto_2
    const/4 p2, 0x0

    invoke-static {p2, p1}, Lr2/a;->e(ILD/n;)V

    :goto_3
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
