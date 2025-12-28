.class public final LN1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:LX1/a;


# instance fields
.field public final a:LX1/c;

.field public final b:LX1/c;

.field public final c:LX1/c;

.field public final d:LX1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX1/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX1/a;-><init>(F)V

    sput-object v0, LN1/f;->e:LX1/a;

    return-void
.end method

.method public constructor <init>(LX1/c;LX1/c;LX1/c;LX1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN1/f;->a:LX1/c;

    iput-object p3, p0, LN1/f;->b:LX1/c;

    iput-object p4, p0, LN1/f;->c:LX1/c;

    iput-object p2, p0, LN1/f;->d:LX1/c;

    return-void
.end method
