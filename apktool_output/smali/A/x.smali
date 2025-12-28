.class public final LA/x;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA/o;LA/G;LA/P;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA/x;->e:I

    sget-object v0, LG1/c;->a:LL/a;

    .line 1
    iput-object p1, p0, LA/x;->g:Ljava/lang/Object;

    iput-object p2, p0, LA/x;->h:Ljava/lang/Object;

    iput-object p3, p0, LA/x;->i:Ljava/lang/Object;

    iput p4, p0, LA/x;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ln0/e0;Lo0/X;LL/a;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA/x;->e:I

    .line 2
    iput-object p1, p0, LA/x;->g:Ljava/lang/Object;

    iput-object p2, p0, LA/x;->h:Ljava/lang/Object;

    iput-object p3, p0, LA/x;->i:Ljava/lang/Object;

    iput p4, p0, LA/x;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lc2/m;->a:Lc2/m;

    iget-object v1, p0, LA/x;->i:Ljava/lang/Object;

    iget-object v2, p0, LA/x;->h:Ljava/lang/Object;

    iget-object v3, p0, LA/x;->g:Ljava/lang/Object;

    iget v4, p0, LA/x;->f:I

    iget v5, p0, LA/x;->e:I

    check-cast p1, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v5, :pswitch_data_0

    or-int/lit8 p2, v4, 0x1

    invoke-static {p2}, LD/d;->J(I)I

    move-result p2

    check-cast v3, Ln0/e0;

    check-cast v2, Lo0/X;

    check-cast v1, LL/a;

    invoke-static {v3, v2, v1, p1, p2}, Lo0/f0;->a(Ln0/e0;Lo0/X;LL/a;LD/n;I)V

    return-object v0

    :pswitch_0
    or-int/lit8 p2, v4, 0x1

    invoke-static {p2}, LD/d;->J(I)I

    move-result p2

    sget-object v4, LG1/c;->a:LL/a;

    check-cast v3, LA/o;

    check-cast v2, LA/G;

    check-cast v1, LA/P;

    invoke-static {v3, v2, v1, p1, p2}, LA/y;->a(LA/o;LA/G;LA/P;LD/n;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
