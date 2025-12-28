.class public final LA/M;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo0/e0;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA/M;->e:I

    .line 1
    iput-object p1, p0, LA/M;->g:Ljava/lang/Object;

    iput p2, p0, LA/M;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lv0/B;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA/M;->e:I

    sget-object v0, LG1/c;->a:LL/a;

    .line 2
    iput-object p1, p0, LA/M;->g:Ljava/lang/Object;

    iput p2, p0, LA/M;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lc2/m;->a:Lc2/m;

    iget-object v1, p0, LA/M;->g:Ljava/lang/Object;

    iget v2, p0, LA/M;->f:I

    iget v3, p0, LA/M;->e:I

    check-cast p1, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v3, :pswitch_data_0

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, LD/d;->J(I)I

    move-result p2

    check-cast v1, Lo0/e0;

    invoke-virtual {v1, p2, p1}, Lo0/e0;->a(ILD/n;)V

    return-object v0

    :pswitch_0
    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, LD/d;->J(I)I

    move-result p2

    sget-object v2, LG1/c;->a:LL/a;

    check-cast v1, Lv0/B;

    invoke-static {v1, p1, p2}, LA/O;->a(Lv0/B;LD/n;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
