.class public final LB2/u;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:LB2/v;

.field public h:LB2/f;

.field public i:LB2/x;

.field public j:Ly2/S;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:LB2/v;

.field public m:I


# direct methods
.method public constructor <init>(LB2/v;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LB2/u;->l:LB2/v;

    invoke-direct {p0, p2}, Li2/c;-><init>(Lg2/d;)V

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LB2/u;->k:Ljava/lang/Object;

    iget p1, p0, LB2/u;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LB2/u;->m:I

    iget-object p1, p0, LB2/u;->l:LB2/v;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, LB2/v;->i(LB2/v;LB2/f;Lg2/d;)V

    sget-object p1, Lh2/a;->d:Lh2/a;

    return-object p1
.end method
